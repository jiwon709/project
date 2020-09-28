package com.my.ssday0919.vo;

public class Ss_nrVO {
	private String PRDCT_NM;	//품목명
	private String IFTKN_ATNT_MATR_CN;	//섭취시주의사항
	private String PRIMARY_FNCLTY;	//주된기능성
	private String DAY_INTK_LOWLIMIT;	//일일섭취량 하한
	private String DAY_INTK_HIGHLIMIT;	//일일섭취량 상한
	private String INTK_UNIT;	//단위
	private String INTK_MEMO;	//REMARK
	private String SKLL_IX_IRDNT_RAWMTRL;	//성분명
	private String CRET_DTM;	//최초등록일
	private String LAST_UPDT_DTM;	//최종수정일
	
	public Ss_nrVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ss_nrVO(String pRDCT_NM, String iFTKN_ATNT_MATR_CN, String pRIMARY_FNCLTY, String dAY_INTK_LOWLIMIT,
			String dAY_INTK_HIGHLIMIT, String iNTK_UNIT, String iNTK_MEMO, String sKLL_IX_IRDNT_RAWMTRL,
			String cRET_DTM, String lAST_UPDT_DTM) {
		super();
		PRDCT_NM = pRDCT_NM;
		IFTKN_ATNT_MATR_CN = iFTKN_ATNT_MATR_CN;
		PRIMARY_FNCLTY = pRIMARY_FNCLTY;
		DAY_INTK_LOWLIMIT = dAY_INTK_LOWLIMIT;
		DAY_INTK_HIGHLIMIT = dAY_INTK_HIGHLIMIT;
		INTK_UNIT = iNTK_UNIT;
		INTK_MEMO = iNTK_MEMO;
		SKLL_IX_IRDNT_RAWMTRL = sKLL_IX_IRDNT_RAWMTRL;
		CRET_DTM = cRET_DTM;
		LAST_UPDT_DTM = lAST_UPDT_DTM;
	}
	public String getPRDCT_NM() {
		return PRDCT_NM;
	}
	public void setPRDCT_NM(String pRDCT_NM) {
		PRDCT_NM = pRDCT_NM;
	}
	public String getIFTKN_ATNT_MATR_CN() {
		return IFTKN_ATNT_MATR_CN;
	}
	public void setIFTKN_ATNT_MATR_CN(String iFTKN_ATNT_MATR_CN) {
		IFTKN_ATNT_MATR_CN = iFTKN_ATNT_MATR_CN;
	}
	public String getPRIMARY_FNCLTY() {
		return PRIMARY_FNCLTY;
	}
	public void setPRIMARY_FNCLTY(String pRIMARY_FNCLTY) {
		PRIMARY_FNCLTY = pRIMARY_FNCLTY;
	}
	public String getDAY_INTK_LOWLIMIT() {
		return DAY_INTK_LOWLIMIT;
	}
	public void setDAY_INTK_LOWLIMIT(String dAY_INTK_LOWLIMIT) {
		DAY_INTK_LOWLIMIT = dAY_INTK_LOWLIMIT;
	}
	public String getDAY_INTK_HIGHLIMIT() {
		return DAY_INTK_HIGHLIMIT;
	}
	public void setDAY_INTK_HIGHLIMIT(String dAY_INTK_HIGHLIMIT) {
		DAY_INTK_HIGHLIMIT = dAY_INTK_HIGHLIMIT;
	}
	public String getINTK_UNIT() {
		return INTK_UNIT;
	}
	public void setINTK_UNIT(String iNTK_UNIT) {
		INTK_UNIT = iNTK_UNIT;
	}
	public String getINTK_MEMO() {
		return INTK_MEMO;
	}
	public void setINTK_MEMO(String iNTK_MEMO) {
		INTK_MEMO = iNTK_MEMO;
	}
	public String getSKLL_IX_IRDNT_RAWMTRL() {
		return SKLL_IX_IRDNT_RAWMTRL;
	}
	public void setSKLL_IX_IRDNT_RAWMTRL(String sKLL_IX_IRDNT_RAWMTRL) {
		SKLL_IX_IRDNT_RAWMTRL = sKLL_IX_IRDNT_RAWMTRL;
	}
	public String getCRET_DTM() {
		return CRET_DTM;
	}
	public void setCRET_DTM(String cRET_DTM) {
		CRET_DTM = cRET_DTM;
	}
	public String getLAST_UPDT_DTM() {
		return LAST_UPDT_DTM;
	}
	public void setLAST_UPDT_DTM(String lAST_UPDT_DTM) {
		LAST_UPDT_DTM = lAST_UPDT_DTM;
	}
	@Override
	public String toString() {
		return "ss_nrVO [PRDCT_NM=" + PRDCT_NM + ", IFTKN_ATNT_MATR_CN=" + IFTKN_ATNT_MATR_CN + ", PRIMARY_FNCLTY="
				+ PRIMARY_FNCLTY + ", DAY_INTK_LOWLIMIT=" + DAY_INTK_LOWLIMIT + ", DAY_INTK_HIGHLIMIT="
				+ DAY_INTK_HIGHLIMIT + ", INTK_UNIT=" + INTK_UNIT + ", INTK_MEMO=" + INTK_MEMO
				+ ", SKLL_IX_IRDNT_RAWMTRL=" + SKLL_IX_IRDNT_RAWMTRL + ", CRET_DTM=" + CRET_DTM + ", LAST_UPDT_DTM="
				+ LAST_UPDT_DTM + "]";
	}
	
	
}
