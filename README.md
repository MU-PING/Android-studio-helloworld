# android-studio-helloworld
## 程式簡介
### 簡述
> 安裝 Android Studio 並建立可互相切換與傳輸資料的簡易兩頁式 APP

* 使用系統預設的 「Empty Activity」 Project 來撰寫

* 有修改的檔案
  * MainActivity.java：主頁面程式
  
  * MinorActivity.java：次頁面程式
  
  * activity_main.xml：主頁面排版
  
  * activity_minor.xml：次頁面排版

  * AndroidManifest：專案設定檔

* 完整專案
  * main.zip：整個專案檔

### 範例圖
<img src="https://user-images.githubusercontent.com/93152909/142003335-da8f1291-5de4-4663-9699-10c9b5a40fd9.gif" width="350px">


## Android Studio
![image](https://user-images.githubusercontent.com/93152909/141791808-a6f48a33-f89f-4141-9d5c-6c229c2aa00b.png)

* 一套由 Google 官方所提供的 Android App( 應用程式 ) 整合式開發環境

* 以 Java 語言來開發, 因此需要 Java 的軟體開發套件, 也就是 JDK

* Android Studio 2.2 開始都已內建了 OpenJDK, 省掉了另外下載的麻煩

* 開發 Android App 的最佳選擇
### 環境安裝
* Android Studio

<img src="https://user-images.githubusercontent.com/93152909/141828335-3946aeaa-edde-4d3a-b14f-7dfa8070109b.png" width="600px">

* Java SDK (高版本 Android Studio 可用內建)

### 建立 Project

* File > New > New Project

* 有兩種開發語言供選擇： Java 、 Kotlin
<img src="https://user-images.githubusercontent.com/93152909/141826701-eaafbf3f-6bfd-40f5-b65f-04db6f6e5932.png" width="700px">

<img src="https://user-images.githubusercontent.com/93152909/141827107-4f0ce26a-bcef-4620-a134-a4620d86e5bd.png" width="700px">


### 建立虛擬機
* AVD manager > Create Virtual Device 
  * AVD manager 用於管理所有已安裝的 Virtual Device  
    <img src="https://user-images.githubusercontent.com/93152909/141829893-0527ef20-b7da-4dbf-a8b1-a35db1740da5.png" width="700px">
  
  * Create Virtual Device 可以選擇想要模擬的硬體，並下載對應的 Image 檔即可使用
    <img src="https://user-images.githubusercontent.com/93152909/141830133-4f2a17bb-e4eb-4881-bc06-9554ffc0de4f.png" width="700px">  
    <img src="https://user-images.githubusercontent.com/93152909/141831056-5d84976c-214c-46e8-b059-b3577b727b72.png" width="700px">

### 資源檔
* 位於 res 資料夾中  
  ![image](https://user-images.githubusercontent.com/93152909/141833755-3272b073-1490-489c-bb97-efb073712ad8.png)
* 優點 - 方便專案管理  
  例如：將字串定義在 strings.xml，類似 C 語言中 #define 的功能，方便修改。
  ![image](https://user-images.githubusercontent.com/93152909/141835987-2d5c991d-5464-491e-9eff-a2f7d2c8c69e.png)
* 資源檔分類
  > xml 的標籤（Tag），在不同分類下不可亂用，要查閱官方的說明
  
  * layout/	：定義使用者介面，版面配置的 XML 檔案
  
  * values/	：包含簡單值 (例如，字串、整數和色彩) 的 XML 檔案
    * arrays.xml 適用於資源陣列
    
    * colors.xml 適用於色彩值
    
    * dimens.xml 適用於維度值
    
    * strings.xml 適用於字串值
    
    * styles.xml 適用於樣式
    
    > 並不是一定要這樣命名, 只是一般習慣上這樣命名

  * drawable/	：點陣圖檔案 (.png、.9.png、.jpg、.gif) 或 XML 檔案
  
  * color/	：定義色彩狀態清單的 XML 檔案
  
  > 補充：不同螢幕解析度之下，需定義不同的 layout 適配數值所使用 eg. margin 要多少，字體大小…等等，通常會把字體大小定義在 dimens.xml，接著在 styles.xml 定義各種UI的樣式(裡面就會用到dimens.xml 定義的字體大小)，最後 layout 中的原件再套用 styles
  
### Layout 模式
* LinearLayout：用於線性排版 (適用list)

* RelativeLayout：相對排版 (萬能)

* TableLayout：可依照表格方式排版

* AbsoluteLayout：絕對位置排版 (不建議使用)

* FrameLayout：框架排版 (常用於一些特效設計)

* ConstraintLayout：進化版的RelativeLayout，性能與適配性皆較優 (3.0後才有)




