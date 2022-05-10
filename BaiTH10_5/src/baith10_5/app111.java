/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith10_5;
import java.util.Scanner;
import java.util.LinkedList;
import java.text.DecimalFormat;
/**
 *
 * @author Admin
 */
public class app111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, node, sum = 0, count = 0;
    double tbCong;
    DecimalFormat dcf = new DecimalFormat("#.##");
    Scanner scanner = new Scanner(System.in);
    LinkedList<Integer> linkedList = new LinkedList<>();
         
    System.out.println("Nhập vào số phần tử của danh sách: ");
    n = scanner.nextInt();
         
    for (int i = 0; i < n; i++) {
        System.out.println("Nhập vào phần tử thứ " + i + ": ");
        node = scanner.nextInt();
        linkedList.add(node);
    }
         
    for (int i = 0; i < n; i++) {
        if (linkedList.get(i) % 2 == 0) {
            sum += linkedList.get(i);
            count++;    // biến lưu trữ số các số chẵn
        }
    }
         
    tbCong = (double)sum / count;
    System.out.println("Trung bình cộng của các số chẵn trong danh sách = " + 
        dcf.format(tbCong));
} // TODO code application logic here
    }
    
