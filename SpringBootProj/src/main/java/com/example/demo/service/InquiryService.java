package com.example.demo.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.example.demo.model.InquiryForm;

@Service
public class InquiryService {

	
	/**
	 * 問い合わせ内容受付処理
	 * @param dataForm
	 * @return
	 */
	public Boolean doInquiryEntry(InquiryForm dataForm)
	{
		
	//追加コード
	//受付日時の生成・設定
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	dataForm.setRecdt(dtf.format(LocalDateTime.now()));
	//追加番号	
	DateTimeFormatter dtNo = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
	dataForm.setRecno("NO" + dtNo.format(LocalDateTime.now()));		
		
	//登録チェック
		if(!checkInquiry(dataForm))
		{
			return false;
		}
		
	//登録処理
		if (!insertInquiry(dataForm))
		{
			return false;
		}
		
		//その他
		if(!otherInquiry(dataForm))
		{
			return false;
		}
		
		
		return true;
	}
			
	/**
	 * 登録チェック
	 * @return
	 */
	private Boolean checkInquiry(InquiryForm dataForm)
	{
		return true;
	}
	
	/**
	 * 登録処理
	 * @return
	 */
	private Boolean insertInquiry(InquiryForm dataForm)
	{
		return true;
	}
	
	/**
	 * その他
	 * @return
	 */
	private Boolean otherInquiry(InquiryForm dataForm)
	{
		return true;
	}
	
}
	