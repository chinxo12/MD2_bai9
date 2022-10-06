package bai1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void Test1() {
        int[] arrDay=new int[3];
        arrDay[0]=1;
        arrDay[1]=1;
        arrDay[2]=2018;
        int[] expectarrDay={2,1,2018};
        int[] result=NextDayCalculator.nextDay(1,1,2018);
        assertArrayEquals(expectarrDay,result);
    }
    @Test
    void Test2() {
        int[] arrDay=new int[3];
        arrDay[0]=31;
        arrDay[1]=1;
        arrDay[2]=2018;
        int[] expectarrDay={1,2,2018};
        int[] result=NextDayCalculator.nextDay(31,1,2018);
        assertArrayEquals(expectarrDay,result);
    }
    @Test
    void Test3() {
        int[] arrDay=new int[3];
        arrDay[0]=30;
        arrDay[1]=4;
        arrDay[2]=2018;
        int[] expectarrDay={1,5,2018};
        int[] result=NextDayCalculator.nextDay(30,4,2018);
        assertArrayEquals(expectarrDay,result);
    }
    @Test
    void Test4() {
        int[] arrDay=new int[3];
        arrDay[0]=28;
        arrDay[1]=2;
        arrDay[2]=2018;
        int[] expectarrDay={1,3,2018};
        int[] result=NextDayCalculator.nextDay(28,2,2018);
        assertArrayEquals(expectarrDay,result);
    }
    @Test
    void Test5() {
        int[] arrDay=new int[3];
        arrDay[0]=29;
        arrDay[1]=2;
        arrDay[2]=2020;
        int[] expectarrDay={1,3,2020};
        int[] result=NextDayCalculator.nextDay(29,2,2020);
        assertArrayEquals(expectarrDay,result);
    }
    @Test
    void Test6() {
        int[] arrDay=new int[3];
        arrDay[0]=31;
        arrDay[1]=12;
        arrDay[2]=2018;
        int[] expectarrDay={1,1,2019};
        int[] result=NextDayCalculator.nextDay(31,12,2018);
        assertArrayEquals(expectarrDay,result);
    }
}