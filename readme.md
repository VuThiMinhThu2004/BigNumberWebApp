# MyBigNumberProject

## Mô tả
Dự án này cung cấp hàm `sum` trong lớp `MyBigNumber` để thực hiện phép cộng hai số lớn biểu diễn dưới dạng chuỗi, mô phỏng cách cộng như học sinh Tiểu học. Lịch sử của mỗi phép toán sẽ được lưu lại trong một file để dễ dàng theo dõi.

## Cấu trúc thư mục
- `src/main/java`: Chứa mã nguồn chính, bao gồm lớp `MyBigNumber`.
- `src/test/java`: Tích hợp Unit Testing để kiểm thử phương thức `sum` trong lớp `MyBigNumber`. Các test case được viết trong `src/test/java/com/example/MyBigNumberTest.java`.
- `src/main/res/history.log`: File `history.log` chứa lịch sử các phép toán đã thực hiện.

## Yêu cầu hệ thống
- **Java** 17 hoặc cao hơn
- **Maven** 3.6 hoặc cao hơn

## Cách build dự án
1. Clone repository:
   ```bash
   git clone https://github.com/VuThiMinhThu2004/MyBigNumberProject.git
   cd MyBigNumberProject
