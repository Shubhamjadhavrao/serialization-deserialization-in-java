/**
 * 
 */
package Serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

/**
 * 
 */
public class User implements Serializable {
	private int uId;
	private String name;
	private String pssword;

	public User() {
		super();

	}

	public User(int uId, String name, String pssword) {
		super();
		this.uId = uId;
		this.name = name;
		this.pssword = pssword;
	}

	private void writeObject(ObjectOutputStream oos) throws Exception {

		System.out.println(">>>>>>>Inside WriteObject Method<<<<<<<<");
//		 oos.defaultWriteObject(); 
		oos.writeInt(uId);
		oos.writeUTF(name);
		String encryptedPwd = Base64.getEncoder().encodeToString(this.pssword.getBytes());
		System.out.println("-----> writing encrypted password : " + encryptedPwd);
		oos.writeUTF(encryptedPwd);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		System.out.println(">>>>>>>Inside ReadObject Method<<<<<<<<");
//		ois.defaultReadObject(); 

		this.uId = ois.readInt();
		this.name = ois.readUTF();
		String ePwd = ois.readUTF();
		byte[] originalPwdBytes = Base64.getDecoder().decode(ePwd.getBytes());
		String originalPwd = new String(originalPwdBytes);
		this.pssword = originalPwd;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPssword() {
		return pssword;
	}

	public void setPssword(String pssword) {
		this.pssword = pssword;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", name=" + name + ", pssword=" + pssword + "]";
	}

}
