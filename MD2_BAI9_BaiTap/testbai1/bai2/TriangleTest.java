package bai2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
@Test
    void Test1(){
    int a=2;
    int b=2;
    int c=2;
    String expect="tam giac deu";
    String result=Triangle.nameTriangle(a,b,c);
    assertEquals(expect,result);
}
    @Test
    void Test2(){
        int a=3;
        int b=3;
        int c=4;
        String expect="tam giac can";
        String result=Triangle.nameTriangle(a,b,c);
        assertEquals(expect,result);
    }

    @Test
    void Test3(){
        int a=3;
        int b=4;
        int c=5;
        String expect="tam giac thuong";
        String result=Triangle.nameTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void Test4(){
        int a=8;
        int b=2;
        int c=4;
        String expect="khong phai la tam giac";
        String result=Triangle.nameTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void Test5(){
        int a=1;
        int b=2;
        int c=-1;
        String expect="khong phai la tam giac";
        String result=Triangle.nameTriangle(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void Test6(){
        int a=0;
        int b=1;
        int c=1;
        String expect="khong phai la tam giac";
        String result=Triangle.nameTriangle(a,b,c);
        assertEquals(expect,result);
    }







}