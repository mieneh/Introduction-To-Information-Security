=============
IrisNhận dạng
=============

Kho lưu trữ này lưu trữ mã phần mềm Java mã nguồn mở Nhận dạng Iris.

Nhận dạng mống mắt được coi là hệ thống nhận dạng sinh trắc học đáng tin cậy nhất. Phần lớn các hệ thống sinh trắc học thương mại sử dụng các thuật toán được cấp bằng sáng chế. Phần mềm này hoàn toàn miễn phí và dựa trên công trình của Libor Masek được trình bày trong luận án của ông ( http://www.csse.uwa.edu.au/~pk/studentprojects/libor/LiborMasekThesis.pdf ).

Làm thế nào nó hoạt động:
=============

Như đã nêu trong luận án Libor, hệ thống bao gồm một hệ thống phân tách dựa trên phép biến đổi Hough. Nó có thể định vị vùng mống mắt và đồng tử, ngoại trừ mí mắt, lông mi và phản xạ.

Vùng Iris sau đó được chuẩn hóa và lọc bởi 1D Log-Gabor. Dữ liệu pha được trích xuất và lượng tử hóa thành bốn cấp độ tạo ra một mẫu mống mắt độc đáo.

Khoảng cách Minkowski được sử dụng để phân loại và so sánh các mẫu.

Với mục đích thử nghiệm, chúng tôi đã sử dụng cơ sở dữ liệu về hình ảnh mắt có sẵn tại Viện Khoa học Trung Quốc. ( http://www.sinobiometrics.com/resources.htm )

Cách sử dụng:
=============

* Vì ứng dụng sử dụng thư viện SWT đi kèm với Eclipse nên bạn phải thêm nó vào đường dẫn lớp của mình.
* Đối với người dùng MS Windows: bạn có thể sử dụng start.bat để khởi động ứng dụng. (nó thêm các thư viện cần thiết vào đường dẫn lớp và khởi động ứng dụng)
* Nó cũng sử dụng thư viện xử lý hình ảnh jhlabs.com để chuyển đổi tọa độ cực (tất cả các lib có trong thư mục con libs)

Điều kiện tiên quyết:
=============
* Thư viện xử lý ảnh jhlabs.com ( http://www.jhlabs.com/ie/ImageEditor.jar )
* Bộ công cụ Widget Tiêu chuẩn (đi kèm với Eclipse) ( swt.jar )
* Hình ảnh y sinh học ( http://bij.isi.uu.nl/downloads/bij_plugin.zip )
* ImageJ ( http://imagej.nih.gov/ij/download/zips/ij144.zip ) (ij.jar)
* tất cả ở trên được bao gồm trong thư mục con libs