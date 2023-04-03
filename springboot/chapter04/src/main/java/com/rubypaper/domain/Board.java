package com.rubypaper.domain;

import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Board
 *
 */
@Entity
public class Board {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long seq;
   private String title;
   private String writer;
   private String content;
   @Temporal(TemporalType.DATE)
   private Date createDate;
   // @Column(length = 50)
   private Long cnt;
	   
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Long getCnt() {
		return cnt;
	}
	public void setCnt(Long cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return String.format("Board [seq=%s, title=%s, writer=%s, content=%s, createDate=%s, cnt=%s]", seq, title,
				writer, content, createDate, cnt);
	}
	
}
