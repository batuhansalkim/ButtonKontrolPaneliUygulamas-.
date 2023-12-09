
                                                                                      Batuhan Salkım 1210505904
                                                                                      Ömer Kargalı  1220505069
                                                                                      

GraphQL nedir?
GraphQL, API'ler için açık kaynaklı bir veri sorgulama ve işleme dilidir ve sorguları mevcut verilerle yerine getirmeye yönelik bir çalışma zamanıdır. GraphQL, 
2015 yılında halka açıklanmadan önce 2012 yılında Facebook tarafından dahili olarak geliştirildi.
GraphQL, REST API'lerin halefi olarak görülen, API'ler için modern bir sorgu dili ve çalışma zamanıdır.
GraphQL, eksik veya fazla veri getirilmeden "tam olarak istediğinizi alın" konsepti üzerine inşa edilmiştir.
Basitçe söylemek gerekirse GraphQL, API'ler için bir sorgu dili ve bu sorguları mevcut verilerle yerine getirmeye yönelik bir çalışma zamanıdır. GraphQL, API'nizdeki verilerin eksiksiz ve anlaşılır
bir tanımını sağlar, müşterilere tam olarak neye ihtiyaç duyduklarını sorma gücü verir, daha fazlasını değil, API'lerin zaman içinde geliştirilmesini kolaylaştırır ve güçlü geliştirici araçlarına 
olanak tanır.GraphQL, bir API ile nasıl konuşulacağına ilişkin bir spesifikasyondur. Genellikle HTTP üzerinden kullanılır; burada temel fikir, POSTfarklı kaynaklar için farklı HTTP uç noktalarına 
ulaşmak yerine bir HTTP uç noktasını "sorgulamak"tır.
Client ve server schema adı verilen ortak bir tanım dosyası üzerinden haberleşir.
Bu schema Schema Definition Language olarak adlandırılan bir syntaxa sahiptir.SDL sayesinde hangi verilerin alınacağı ve bu verilerin arasındaki ilişki tanımlanmış olur.
Aynı zamanda SDL client ve server arasında validasyon sağlar.
GraphQL’in en önemli özelliği REST API’daki gibi tüm veriyi almamız gerekmiyor.
GraphQL in avantajları nelerdir ?
1)İhtiyaç duyulan verileri client kontrol eder
2)Birçok protokol desteği mevcut
3)Versiyonlamaya ihtiyaç yok
4)Daha az band genişliği kullanımı
5)Tip kontrolü mevcut
6)Dökümantasyon Kolaylığı

GraphQL’in dezavantajları nelerdir ?
1)Caching
2)Complex Query
3)Exception Handling
GraphQL kullanımı
GraphQL sunucu ce istemciden oluşur.
Sunucu tarafında istemciye gönderilecek olan verilerle ilgili bilgiler yer alır.
örnek GraphQL şeması
type User {
  name: String!
  age: Int!
  email: String!
  street: String!
  zipcode: String!
  city: String!
}
şeklinde olur 
Data fetching: Bu işleminin GraphQL’in en ilgi çekici özelliği olduğunu düşünüyorum. Çünkü Rest API da istediğimiz verileri elde etmek için çok fazla sayıda endpointe istek atmak zorunda kalabiliyoruz. 
GraphQL ise sunucuda bulunan verilere erişebilmemiz için tek bir endpoint sunar. RESTful API ında client üzerinden server a istek attığınızda attığınız isteğin tipine göre ( get, post, put, delete) size 
bir obje döndüğünü veya bir obje gönderdiğimizi bildiğimizi varsayıyorum. İşte GraphQL client tarafında tam da bu noktada devreye giriyor. Siz istek atarken istediğiniz objeye ve o objenin hangi 
propertylerine erişmek istiyorsanız client da belirtip ona göre istek atabiliyorsunuz.Server da ona göre bir dizayn oluşturduğu için sizin istediğinize cevap veriyor.
Document: Rest API oluştururken API dokumantasyonunu sizin yapmanız gerekir. Swagger ile konfigurasyon oluşturup dokumantasyonunuzu hazırlayabilirsiniz. Fakat GraphQL de dokumantasyonu hazırlamanıza 
gerek kalmıyor. GraphiQL sizin için bir docs ve playground ortamı sunar.Sizin yazdığınız queryler ile bir şema ve dokumantasyon oluşturur ve sağladığı playground ile istediğiniz query i çalıştırıp ne 
döndüğünü de görebilirsiniz.
Caching: GraphQL de client dan server a sadece post isteği atabildiğimiz için cachelemede sıkıntılar yaşayabiliriz. Post isteği yolladığımız için proxy bu isteği analiz edemez. Yapmamız gereken body 
içerisinde bilgileri de göndermek. Bunlara çözüm olarak client ve server ı ayırmak sorunu çözmek için bir alternatif olabilir.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

"Button Kontrol Paneli Uygulaması" ifadesi genel bir tanımlama olduğu için uygulamanın amacı ve kullanım alanları belirli bir bağlamda daha spesifikleştirilmelidir. 
Ancak, genel olarak düşündüğümüzde, bir "Button Kontrol Paneli Uygulaması"nın çeşitli kullanım alanları olabilir.

Ev Otomasyon Sistemleri:
Ev sahiplerinin evlerindeki farklı cihazları, lambaları veya elektronik ekipmanları kontrol etmelerini sağlayabilir. Örneğin, ışıkları açma/kapama, termostatı ayarlama veya güvenlik kameralarını 
kontrol etme gibi işlemleri kolaylaştırabilir.

Endüstriyel Kontrol Sistemleri:
Büyük tesislerde veya endüstriyel alanlarda, çeşitli makinelerin ve sistemlerin kontrolünü sağlamak için kullanılabilir. Bu, üretim hattındaki işlemleri izleme, cihazları etkinleştirme veya devre dışı 
bırakma gibi işlemleri içerebilir.

UYGULAMA ÇALIŞMASI KULLANIMI VE TEST SÜREÇLERİ

uygulama ilk çalıtığında bu şekilde geliyor 
![image](https://github.com/batuhansalkim/ButtonKontrolPaneliUygulamas-./assets/98403227/72a87d8b-4809-4ec2-9312-e33604cf283b)
Hangisinin üzerine tıklarsak rengi siyah oluyor ve yazısı aktiften pasife dönüyor
![image](https://github.com/batuhansalkim/ButtonKontrolPaneliUygulamas-./assets/98403227/41e334e9-00df-4559-9318-7e7d3f48b816)
Her üzerine tıkladıgımızda linkini veriyor
![image](https://github.com/batuhansalkim/ButtonKontrolPaneliUygulamas-./assets/98403227/0b909e70-e502-41b2-b598-54b19cd5893e)
Tekrar tıklarsak eski haline geri geliyor
![image](https://github.com/batuhansalkim/ButtonKontrolPaneliUygulamas-./assets/98403227/7e4fde14-9844-4001-b476-ec66be69bb36)
Bir kaç tane butonun üzerine tıklıyoruz ve renk değşiyor yazıları değişiyor 
![image](https://github.com/batuhansalkim/ButtonKontrolPaneliUygulamas-./assets/98403227/882c6bec-cf6f-46f0-9b29-1e9fb2abf358)
sonrasında ilk tıkladıgımıza tekrar tıkladıgımızda hepsi kapanıyor sadece ilk bastığımız aktif kalıyor.
![image](https://github.com/batuhansalkim/ButtonKontrolPaneliUygulamas-./assets/98403227/1b62c503-f7f4-4243-908e-5bd9f9b6a0de)





