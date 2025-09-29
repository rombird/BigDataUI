package Ch06;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C11RestRequestResponseMain {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// 01 요청URL 파라미터 지정
		String url = "https://www.daegufood.go.kr/kor/api/tasty.html";
		String mode = "json";
		String addr = "중구";
		url = url + "?mode=" + mode + "&addr=" + addr;
		
		// 02 Http Request 구성
		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
		
		// 03 Request 요청 -> Response 받기
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		// System.out.println(response.body());
		
		// 04 받은 Data Class화 - 프레임워크에서도 사용
		
		
		// 04-1) JSON Type 유지 - json의 key값 활용해서 value 값 찾기
//		ObjectMapper objectMapper = new ObjectMapper();
//		JsonNode jsonNode = objectMapper.readTree(response.body());
//		System.out.println("status : " + jsonNode.get("status")); 
//		System.out.println("total : " + jsonNode.get("total"));
//		JsonNode data = jsonNode.get("data");	// data는 배열의 형태{}로 저장
//		for(int i=0;i<data.size();i++) {
//			JsonNode item = data.get(i);
//			System.out.println(item.get("BZ_NM"));
//		}
		
		// 04-2) JAVA Class로 변환
		ObjectMapper objectMapper = new ObjectMapper();
		Root responseObject = objectMapper.readValue(response.body(), Root.class);
		System.out.println("status : " + responseObject.status); 
		System.out.println("total : " + responseObject.total); 
		responseObject.data.forEach(System.out::println); // 속성에 대한 toString 재정의가 되면 항목들 모두 출력됨
	}
	
	// Inner class
	// 클래스 내에서만 객체를 생성할 수 있는 이너 클래스
	// public -> private static 으로 작업해줘야 이름 중복 문제 생기지 X
	private static class Data{
	    public String cnt;
	    @JsonProperty("OPENDATA_ID")  // 특정한 키에 해당하는 것이 저장될 수 있도록
	    public String oPENDATA_ID;
	    @JsonProperty("GNG_CS") 
	    public String gNG_CS;
	    @JsonProperty("FD_CS") 
	    public String fD_CS;
	    @JsonProperty("BZ_NM") 
	    public String bZ_NM;
	    @JsonProperty("TLNO") 
	    public String tLNO;
	    @JsonProperty("MBZ_HR") 
	    public String mBZ_HR;
	    @JsonProperty("SEAT_CNT") 
	    public String sEAT_CNT;
	    @JsonProperty("PKPL") 
	    public String pKPL;
	    @JsonProperty("HP") 
	    public String hP;
	    @JsonProperty("PSB_FRN") 
	    public String pSB_FRN;
	    @JsonProperty("BKN_YN") 
	    public String bKN_YN;
	    @JsonProperty("INFN_FCL") 
	    public String iNFN_FCL;
	    @JsonProperty("BRFT_YN") 
	    public String bRFT_YN;
	    @JsonProperty("DSSRT_YN") 
	    public String dSSRT_YN;
	    @JsonProperty("MNU") 
	    public String mNU;
	    @JsonProperty("SMPL_DESC") 
	    public String sMPL_DESC;
	    @JsonProperty("SBW") 
	    public String sBW;
	    @JsonProperty("BUS") 
	    public String bUS;
	    
	    // toString 재정의
		@Override
		public String toString() {
			return "Data [cnt=" + cnt + ", oPENDATA_ID=" + oPENDATA_ID + ", gNG_CS=" + gNG_CS + ", fD_CS=" + fD_CS
					+ ", bZ_NM=" + bZ_NM + ", tLNO=" + tLNO + ", mBZ_HR=" + mBZ_HR + ", sEAT_CNT=" + sEAT_CNT
					+ ", pKPL=" + pKPL + ", hP=" + hP + ", pSB_FRN=" + pSB_FRN + ", bKN_YN=" + bKN_YN + ", iNFN_FCL="
					+ iNFN_FCL + ", bRFT_YN=" + bRFT_YN + ", dSSRT_YN=" + dSSRT_YN + ", mNU=" + mNU + ", sMPL_DESC="
					+ sMPL_DESC + ", sBW=" + sBW + ", bUS=" + bUS + "]";
		}
	    
	    
	    
	}
	
	// 전체 데이터를 담는 Root 클래스
	private static class Root{
	    public String status;
	    public String total;
	    public ArrayList<Data> data; 
	}

	
}
