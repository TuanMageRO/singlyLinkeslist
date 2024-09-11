
package singlylinkedlist;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        // Khởi tạo danh sách liên kết
        MyList list = new MyList();

        // Thêm node vào đầu danh sách
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        
        // Hiển thị danh sách
        System.out.println("Danh sách sau khi thêm vào đầu:");
        list.traverse(); // Output: 30 -> 20 -> 10 -> null

        // Thêm node vào cuối danh sách
        list.addLast(40);
        list.addLast(50);

        // Hiển thị danh sách
        System.out.println("Danh sách sau khi thêm vào cuối:");
        list.traverse(); // Output: 30 -> 20 -> 10 -> 40 -> 50 -> null

        // Xóa node đầu tiên có giá trị là 20
        list.deleteFirstAppear(20);
        
        // Hiển thị danh sách sau khi xóa
        System.out.println("Danh sách sau khi xóa giá trị 20:");
        list.traverse(); // Output: 30 -> 10 -> 40 -> 50 -> null

        // Chèn node mới tại vị trí thứ 2
        list.insert(25, 2);
        list.insert(50, 3);
        
        // Hiển thị danh sách
        System.out.println("Danh sách sau khi chèn giá trị 25 vào vị trí thứ 2 và 50 vào vị trí thứ 3:");
        list.traverse(); // Output: 30 -> 25 -> 10 -> 40 -> 50 -> null

        // Thêm node trước node có giá trị 10
        Node nodeWith10 = list.head.next.next; // Node thứ ba có giá trị 10
        list.addBefore(15, nodeWith10);
        
        // Hiển thị danh sách
        System.out.println("Danh sách sau khi thêm giá trị 15 trước 10:");
        list.traverse(); // Output: 30 -> 25 -> 15 -> 10 -> 40 -> 50 -> null

        // Thêm node sau node có giá trị 40
        Node nodeWith40 = list.head.next.next.next.next; // Node thứ năm có giá trị 40
        list.addAfter(45, nodeWith40);
        
        // Hiển thị danh sách
        System.out.println("Danh sách sau khi thêm giá trị 45 sau 40:");
        list.traverse(); // Output: 30 -> 25 -> 15 -> 10 -> 40 -> 45 -> 50 -> null

        // Xóa tất cả các giá trị 50
        list.deleteAll(50);
        
        // Hiển thị danh sách sau khi xóa tất cả các giá trị 50
        System.out.println("Danh sách sau khi xóa tất cả giá trị 50:");
        list.traverse(); // Output: 30 -> 25 -> 15 -> 10 -> 40 -> 45 -> null
    }
}
