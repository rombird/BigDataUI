package Ch06;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//크롬서버.jar 다운로드 경로(셀레니움 공식 홈페이지)
//https://www.selenium.dev/downloads/

//크롬드라이브 다운로드 경로
//https://googlechromelabs.github.io/chrome-for-testing/#stable

public class C10SeleniumAPIMain {
	
	// 기본 setting
	private static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	private static final String WEB_DRIVER_PATH = "src/Drivers/chromedriver.exe"; 
	
	
	public static void main(String[] args) throws InterruptedException {
		// Selenium 3.x 기준 브라우저 활성화 방법(4.x 부터는 chromedriver.exe를 윈도우 PATH에 등록시 결로설정 필요없음)
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		// 크롬브라우저 옵션 설정
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");			// 백그라운드 실행 -> 크롬이 띄워지진 않지만 시스템 실행중인 상태
//		options.addArguments("--no-sandbox");		// 리눅스환경 sendbox 사용 여부
		
		// 크롬브라우저 활성화
		WebDriver driver = new ChromeDriver(options); 
		driver.get("https://www.naver.com");
		
		// 특정 요소 위치 선택(키워드 입력하기) - 검색창(input id="query")
		WebElement searchEl = driver.findElement(By.id("query"));
		
		// 키워드 입력(검색창에)
		searchEl.sendKeys("모니터");
		
		// 엔터키 전달
		searchEl.sendKeys(Keys.RETURN);
		
		// 쇼핑버튼 클릭(정확한 클래스를 찾기 위해 class : .api_flicking_wrap .tab:nth-child(1))
		WebElement shoppingBtnEl = driver.findElement(By.cssSelector(".api_flicking_wrap .tab:nth-child(1)"));
		// 새창열기(target="_blank") 제거 -> 기존 탭에서 계속 실행
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('target')",shoppingBtnEl);
		shoppingBtnEl.click();
		Thread.sleep(500);
		
		// 리뷰좋은순 클릭 (.subFilter_sort_4Q_hv._nlog_click._nlog_impression_element)
//		WebElement reviewBtnEl = driver.findElement(By.cssSelector(".subFilter_sort_4Q_hv._nlog_click._nlog_impression_element"));
//		reviewBtnEl.click();
		
		// 창닫기
		// driver.close();

	}

}
