package com.qa.project.selenium.ProjectSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath ="/html/body/section[1]/div/div[1]/div/div[5]/div/div[2]/div/div/div/a")
	private WebElement discoverButton;
	
	@FindBy(xpath = "/*[@id='getHitchedNav']/a/img")
	private WebElement logoButton;

	@FindBy(xpath = "/html/body/section[2]/div/div/div[1]/a/p/img")
	private WebElement dreamButton;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/a/p/img")
	private WebElement planButton;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[3]/a/p/img")
	private WebElement bookButton;
	
	@FindBy(xpath = "/html/body/section[4]/div/div[3]/div/div/a")
	private WebElement loadMore;
	
	@FindBy(xpath = "/html/body/section[6]/div/div[2]/div[1]/div/a/h5")
	private WebElement bridalGifts;
	
	@FindBy(xpath = "/html/body/section[6]/div/div[2]/div[2]/div/a/h5")
	private WebElement groomsmansGifts;
	
	@FindBy(xpath = "/html/body/section[6]/div/div[2]/div[3]/div/a/h5")
	private WebElement bridemaidsmaidsGifts;
	
	@FindBy(xpath = "/html/body/section[6]/div/div[2]/div[4]/div[1]/a/h5")
	private WebElement weddingFavours;
	
	public void discover() {
		discoverButton.click();
	}	
	public void logo() {
		logoButton.click();
	}
	public void dream() {
		dreamButton.click();
	}
	public void plan() {
		planButton.click();
	}
	public void book() {
		bookButton.click();
	}
	public void loadMore() {
		loadMore.click();
	}
	public void bridal() {
		bridalGifts.click();
	}
	public void groomsman() {
		groomsmansGifts.click();
	}
	public void bridemaid() {
		bridemaidsmaidsGifts.click();
	}
	public void favours() {
		weddingFavours.click();
	}
		
}
