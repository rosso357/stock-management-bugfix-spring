package jp.co.rakus.stockmanagement.web;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

/**
 * メンバー関連のリクエストパラメータが入るフォーム.
 * 
 * @author igamasayuki
 *
 */
public class MemberForm {
	/** 名前 */
	@NotBlank(message = "名前は必須です")
	private String name;
	/** メールアドレス */
	@NotBlank(message = "メールアドレスの形式が違います。")
	private String mailAddress;
	/** パスワード */
	@Size(min = 1, max = 8, message = "１文字以上８文字未満で入力してください。")
	private String password;
	/** 確認用パスワード */
	@Size(min = 1, max = 8, message = "１文字以上８文字未満で入力してください。")
	private String passwordConfirm;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
}
