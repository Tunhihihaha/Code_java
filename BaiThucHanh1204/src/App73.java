import mybackage4.ToaDo;
public class App73 {

    public static void main(String[] args) {
        // Các thuộc tính x, y này chỉ được truy xuất đến thông qua thể hiện toaDo1
        ToaDo toaDo1 = new ToaDo();
        toaDo1.x = 10;
        toaDo1.y = 20;

        // Các thuộc tính x, y này chỉ được truy xuất đến thông qua toaDo2
        ToaDo toaDo2 = new ToaDo();
        toaDo2.x = 5;
        toaDo2.y = 6;

        // Thuộc tính thongTin lại được truy xuất đến thông qua lớp ToaDo
        ToaDo.thongTin = " lưu tọa độ các hình học";
    }
}
