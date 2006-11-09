/**
 * Created on 2006-10-22 下午11:22:53
 */
package cn.net.openid.dao;

import java.util.List;

import cn.net.openid.Credential;

/**
 * @author Shutra
 * 
 */
public interface CredentialDao {
	long countCredentials(String userId);

	void deleteCredential(Credential credential);

	Credential getCredential(String id);

	List<Credential> getCredentials(String userId);

	String insertCredential(Credential credential);

	void updateCredential(Credential credential);
}
