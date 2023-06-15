# UÇAK REZERVASYON JAVA PROJESİ 
-Bu bir uçak rezervasyon projesidir. 
-Proje Eclipse IDE ve Java kullanılarak hazırlanmıştır.
-Kullanıcı, adı, soyadı, kimlik numarası, telefon numarası, e-posta adresi ve özel ihtiyaçları var mı yok mu gibi kişisel bilgilerini girdikten sonra, kalkış ve varış noktalarını, seyahat tarihlerini ve tercih edilen uçağı seçebilir. Ardından, -size verilen saat ve koltuk numarasını ekrana yazdırıp uçuş rezervasyonu oluşturulur ve kullanıcıya gösterilir.
-Uygulama, JAVA programlama dili kullanılarak geliştirilmiştir. 
-Veriler, sınıflar kullanılarak yönetilir ve kullanıcının girdiği bilgiler kullanılarak bir rezervasyon oluşturulur. Uygulama, kullanıcıya çeşitli bilgileri ve seçenekleri sormak için konsol arayüzünü kullanır.
-Uygulama, uçak ve havalimanı bilgilerini içeren iki ayrı sınıf kullanır. Uçak bilgileri, uçak markası, yolcu kapasitesi, hızı ve sınıfı gibi bilgileri içeren bir Aircraft sınıfında tutulurken, havalimanı bilgileri, havalimanı adı ve şehir gibi -bilgileri içeren bir Location sınıfında tutulur. Bu bilgiler, kullanıcıya seyahat seçenekleri sunmak için kullanılır.

-----------------------------------------------------------------------------------------------------------------

Ana_Program sınıfı = Uçak rezervasyonu uygulamasının çalıştırılmasını sağlayan ve kullanıcıdan gerekli girişleri alarak rezervasyon işlemini gerçekleştiren bir sınıftır.

-----------------------------------------------------------------------------------------------------------------

AircraftManager sınıfı = Uçakların ve özelliklerinin yönetildiği sınıftır. 

-----------------------------------------------------------------------------------------------------------------

LocationManager sınıfı = Uçuş noktalarının ve havalimanlarının yönetildiği sınıftır. 

-----------------------------------------------------------------------------------------------------------------

Location sınıfı = Bir lokasyonun ülke, şehir ve havalimanı bilgilerini içerir. 

-----------------------------------------------------------------------------------------------------------------

Reservation sınıfı = Bir rezervasyonun bilgilerini içerir. Rezervasyon oluşturulduğunda rasgele bir koltuk numarası ve rezervasyon saati atanır.

-----------------------------------------------------------------------------------------------------------------

Aircraft sınıfı = Bir uçağın bilgilerini içerir. getCapacity metodu ile uçağın kapasitesi alınabilir.

-----------------------------------------------------------------------------------------------------------------

Customer sınıfı = Bir müşterinin bilgilerini içerir.

-----------------------------------------------------------------------------------------------------------------
