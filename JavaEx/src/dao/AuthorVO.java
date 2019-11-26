package dao;

//	DTO(VO) : 자바 클래스간 혹은 레이어간 데이터를 주고받기 위한 객체
//	- 일반적으로 로직관련 메서드는 갖지 않는다
//	- 기본 생성자 1개가 있어야 한다
//	- GETTER/SETTER를 이용해서 필드를 세팅한다
//	- toString, equals 정도는 가질 수 있다
public class AuthorVO {
	//	필드
	private Long authorId;
	private String authorName;
	private String authorDesc;
	
	public AuthorVO() {}	//	기본 생성자
	
	public AuthorVO(Long id, String name, String desc) {
		authorId = id;
		authorName = name;
		authorDesc = desc;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorDesc() {
		return authorDesc;
	}

	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}

	@Override
	public String toString() {
		return "AuthorVO [authorId=" + authorId + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}

	@Override
	public boolean equals(Object arg0) {
		// 비교 객체의 authorId와 자신의 authorId가 같다면(PK)
		//	같은 레코드다
		if (arg0 instanceof AuthorVO) {
			AuthorVO other = (AuthorVO)arg0;
			return this.authorId == other.authorId;
		}
		return super.equals(arg0);
	}
	
	

}