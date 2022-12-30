package com.Nagendra.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale.Category;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@SuppressWarnings("serial")
@Entity
@Table(name = "stock", catalog = "nagendradb", uniqueConstraints = { 
@UniqueConstraint(columnNames = "STOCK_NAME"),
@UniqueConstraint(columnNames = "STOCK_CODE") })


public class Stock implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STOCK_ID", unique = true, nullable = false)
	private Integer stockId;
	@Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
	private String stockCode;
	@Column(name = "STOCK_NAME", unique = true, nullable = false, length = 10)
	private String stockName;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "stock_category", catalog = "hibernatedb", joinColumns = {
	@JoinColumn(name = "STOCK_ID", nullable = false, updatable = false) }, 
	inverseJoinColumns = {@JoinColumn(name = "CATEGORY_ID", nullable = false, updatable = 
	false) })
	private Set<Category> categories = new HashSet<Category>(0);
	public Stock() {
	super();}
	public Stock(String stockCode, String stockName) {
	super();
	this.stockCode = stockCode;
	this.stockName = stockName; }
	public Stock(String stockCode, String stockName, Set<Category> categories) {
	super();
	this.stockCode = stockCode;
	this.stockName = stockName;
	this.categories = categories; }
	public Integer getStockId() {
	return stockId;}
	public void setStockId(Integer stockId) {
	this.stockId = stockId; }
	public String getStockCode() {
	return stockCode; }
	public void setStockCode(String stockCode) {
	this.stockCode = stockCode; }
	public String getStockName() {
	return stockName; }
	public void setStockName(String stockName) {
	this.stockName = stockName; }
	public Set<Category> getCategories() {
	return categories; }
	public void setCategories(Set<Category> categories) {
	this.categories = categories; }
	public void save() {
		// TODO Auto-generated method stub
		
	}}

