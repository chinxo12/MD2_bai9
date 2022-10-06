package bai1;

import java.util.Scanner;

public class NextDayCalculator {
    public static void main(String[] args) {

    }

    public static int[] nextDay(int inputday, int inputmonth, int inputYear) {
        int[] arrReturnDay = new int[3];
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập ngày: ");
//        inputday = Integer.parseInt(sc.nextLine());
//        System.out.print("Nhập tháng: ");
//        inputmonth = Integer.parseInt(sc.nextLine());
//        System.out.print("Nhập năm: ");
//        inputYear = Integer.parseInt(sc.nextLine());
        if (inputday == 30) {
            switch (inputmonth) {
                case 4:
                case 6:
                case 9:
                case 11:
                    inputday = 1;
                    ++inputmonth;
                    break;
                default:
                    System.out.println("nhập sai ngày hoặc tháng");
            }
        } else if (inputday == 31) {
            switch (inputmonth) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                    inputday = 1;
                    ++inputmonth;
                    break;
                case 12:
                    inputday = 1;
                    inputmonth = 1;
                    ++inputYear;
                    break;
                default:
                    System.out.println("nhập sai ngày hoặc tháng");
            }
        } else if (inputday == 28 && inputmonth == 2) {
            if (inputYear % 4 == 0) {
                if (inputYear % 100 == 0) {
                    if (inputYear % 400 == 0) {
                        ++inputday;//nam nhuan
                    } else {
                        inputday = 1;  // nam thuong
                        ++inputmonth;
                    }
                } else {
                    ++inputday;//nam nhuan
                }
            } else {
                inputday = 1;  // nam thuong
                ++inputmonth;

            }
        } else if (inputday == 29 && inputmonth == 2) {
            if (inputYear % 4 == 0) {
                if (inputYear % 100 == 0) {
                    if (inputYear % 400 == 0) {
                        inputday = 1;//nam nhuan
                        ++inputmonth;
                    } else {
                        System.out.printf("Không tồn tại ngày: %d/%d/%d", inputday, inputmonth, inputYear);// nam thuong
                    }
                } else {
                    inputday = 1;//nam nhuan
                    ++inputmonth;

                }
            } else {
                System.out.printf("Không tồn tại ngày: %d/%d/%d", inputday, inputmonth, inputYear);// nam thuong
            }

        } else {
            ++inputday;
        }
        arrReturnDay[0] = inputday;
        arrReturnDay[1] = inputmonth;
        arrReturnDay[2] = inputYear;
        System.out.printf("Nextday is: %d/%d/%d", inputday, inputmonth, inputYear);
        return arrReturnDay;
    }


}
