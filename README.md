# Computer Sales System – Spring Boot

Bu proje, bilgisayar satış domainine ait verileri yönetmek için geliştirilmiş **RESTful API** uygulamasıdır. Uygulama **Spring Boot** ile geliştirilmiş olup **katmanlı mimari** prensiplerine göre yapılandırılmıştır. Projede **dinamik filtreleme (JPA Specification)**, **DTO yapısı**, **servis katmanı**, **error handling** ve **MySQL veritabanı entegrasyonu** bulunmaktadır.

---

## 🚀 Özellikler

- Ürün (**Product**), kategori (**Category**), müşteri (**Customer**) ve sipariş (**Order**) yönetimi
- **Dinamik filtreleme** ile esnek arama (JPA Specification)
- **Sayfalama ve sıralama desteği**
- **DTO yapısı** ile veri taşımada güvenlik ve performans
- Global exception handling (`@ControllerAdvice`)
- Katmanlı mimari ile profesyonel backend tasarımı

---

## 🏗️ Proje Mimarisi

com.yakup.sales
├─ controller → REST API controller katmanı
├─ service → İş mantığı katmanı
│ └─ impl
├─ repository → JPA veri erişim katmanı
├─ specification → Dinamik filtreleme yapısı
├─ dto → Request/Response veri transfer modelleri
├─ domain → Entity modelleri

🔍 Dinamik Filtreleme (JPA Specification)
Bu proje JPA Specification ile dinamik filtreleme desteği sunar.

✅ Örnek istek:

POST /api/products/search
{
  "page": 0,
  "size": 10,
  "searchRequestDto": [
    { "column": "name", "operation": "LIKE", "value": "Lenovo" },
    { "column": "price", "operation": "GT", "value": 1000 },
    { "join": "category", "column": "name", "operation": "EQUAL", "value": "Laptop" }
  ]
}

🛠️ Kullanılan Teknolojiler
Teknoloji	Açıklama
Java 17+	Programlama dili
Bahar Botu	Arka uç çerçevesi
Spring Data JPA	Veri erişimi
MySQL	Veritabanı
Lombok	Kod basitleştirme
JPA Spesifikasyonu	Dinamik filtre
Maven	Build yönetimi
Postacı	API testleri

⚙️ Gereksinimler
Java 17
MySQL
Maven

🎯 Projeyi Çalıştırma
mvn clean install
mvn spring-boot:run

Uygulama açıldıktan sonra:
http://localhost:8080

📌 Örnek API Uçları
HTTP	Endpoint
GET	/api/products
POST	/api/products
POST	/api/products/search
GET	/api/categories
POST	/api/categories

🧪 API Testi

Postman collection klasörü proje içinde mevcuttur ve API testleri için kullanılabilir.


