package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.InquiryForm;
import com.example.demo.service.InquiryService;

@Controller
public class InquiryController{
	
//問い合わせ処理クラス
@Autowired InquiryService inquiryService;

@GetMapping("/InquiryForm")
//public String inputForm(@ModelAttribute InquiryForm formData,Model model) 
public String inputForm(@ModelAttribute InquiryForm dataForm,Model model) 

{ 
	
//model.addAttribute("formData",new InquiryForm());
model.addAttribute("dataForm",new InquiryForm());
return "InquiryForm";	
}
	
@PostMapping("/InquiryResult")
//public String Result(@ModelAttribute InquiryForm formData, Model model) {
public String Result(@ModelAttribute InquiryForm dataForm, Model model) {
		
	
	//問い合わせ処理の実施 /
//inquiryService.doInquiryEntry(formData);
inquiryService.doInquiryEntry(dataForm);
	
//model.addAttribute("formData",formData);
model.addAttribute("dataForm",dataForm);
	return "InquiryResult";
}
}
