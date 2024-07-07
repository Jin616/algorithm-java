package queue.queue.boj.silver;

import java.io.*;
import java.util.*;

public class S2_5464 {
	
	static class Car {
		int weight, parkingNum; // 무게, 주차했을 시 주차공간 번호

		Car(String weight) {
			this.weight = Integer.parseInt(weight);
		}
	}
	
	static class Parking {
		int price, num; // 주차공간의 가격, 주차공간 번호
		boolean isParked = false; // 주차 되었는지 여부

		Parking(String price, int num) {
			this.price = Integer.parseInt(price);
			this.num = num;
		}
	}
	
	// 차에 어디에 주차했는지 저장하고, 주차 공간의 boolean 값 갱신하고, 값 계산해서 리턴
	static int park(Parking parking, Car car) {
		car.parkingNum = parking.num;
		parking.isParked = true;
		
		return parking.price * car.weight;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(args[0]));
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]); // 주차 공간의 수 n
		int m = Integer.parseInt(str[1]); // 주차 차량의 수 m
		
		// 주차 공간 입력 받음
		List<Parking> parkings = new ArrayList<Parking>();
		for (int i = 0; i < n; i++)
			parkings.add(new Parking(br.readLine(), i));
		
		// 차 정보 입력 받음
		List<Car> cars = new ArrayList<Car>();
		for (int i = 0; i < m; i++)
			cars.add(new Car(br.readLine()));
		
		// 알고리즘
		m *= 2;
		long answer = 0L;
		Queue<Car> qCar = new LinkedList<Car>(); // 주차장 입구에서 대기할 queue
		while (m-- > 0) { // 차량당 두줄씩 2m번 반복
			String line = br.readLine();
			// 명령 분석
			boolean isParking = line.charAt(0) != '-' ? true : false;
			Car car = cars.get(Math.abs(Integer.parseInt(line)) - 1); 
			
			if (isParking) { // 주차한다면
				boolean parkCheck = false; // 주차했는지 실패로 선언
				
				// 주차 공간 순회 1번부터 순회 함
				for (Parking parking : parkings) {
					if (!parking.isParked) { // 주차공간이 비었다면
						answer += park(parking, car); // 값 계산
						parkCheck = true; // 주차 성공 반복문 빠져나감
						break;
					}
				}
				
				if (!parkCheck) // 주차 실패했다면
					qCar.add(car); // 대기열에 차 집어넣음
			} else { // 주차를 푼다면, 차를 뺀다면
				Parking parking = parkings.get(car.parkingNum); // 차에서 주차 공간 정보 가져옴
				parking.isParked = false; // 주차 공간이 비었다고 갱신
				
				if (!qCar.isEmpty()) { // 대기열에 차가 있다면
					car = qCar.poll(); // 차를 가져와서
					answer += park(parking, car); // 주차시키고 값 계산
				}
			}
		}
		
		bw.write("" + answer);
		bw.flush();
		// br.close();
		// bw.close();
	}
}