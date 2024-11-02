# BigNumberWebApp

## Mô tả
BigNumberWebApp là một ứng dụng web sử dụng Spring Boot, Thymeleaf và Bootstrap, cho phép người dùng nhập hai số lớn và thực hiện phép cộng như cách học sinh tiểu học thực hiện (từng bước cộng với giá trị nhớ). Kết quả và các bước tính toán sẽ được hiển thị trên giao diện web.

Dự án này sử dụng thư viện `MyBigNumberProject` để thực hiện phép cộng hai số lớn.

## Cấu trúc thư mục

- `src/main/java/com/example/controller`: Chứa `CalculatorController` để xử lý yêu cầu từ người dùng và trả về kết quả cộng.
- `src/main/java/com/example/service`: Chứa `CalculatorService` và `CalculationResult`. `CalculatorService` thực hiện phép tính và `CalculationResult` lưu kết quả cùng với lịch sử từng bước tính toán.
- `src/main/resources/templates`: Chứa các tệp HTML được tạo bởi Thymeleaf, bao gồm:
  - `calculator.html`: Trang nhập số cho phép cộng.
  - `result.html`: Trang hiển thị kết quả phép tính và lịch sử từng bước.
- `src/main/resources/static`: Chứa các tài nguyên tĩnh (CSS, JS nếu cần).
- `libs`: Chứa thư viện `.jar` của `MyBigNumberProject` được tích hợp vào ứng dụng để thực hiện phép tính.

## Yêu cầu hệ thống

- **Java** 17 hoặc cao hơn
- **Maven** 3.6 hoặc cao hơn
- **Spring Boot** 2.5.6 (được cấu hình sẵn trong `pom.xml`)

## Cách cài đặt và chạy ứng dụng

1. **Clone repository**:
   ```bash
   git clone https://github.com/your-username/BigNumberWebApp.git
   cd BigNumberWebApp

2. **Truy cập vào ứng dụng trên Localhost**: 
    http://localhost:8080/
