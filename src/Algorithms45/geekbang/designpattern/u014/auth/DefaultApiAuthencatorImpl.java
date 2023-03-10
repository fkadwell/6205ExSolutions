package Algorithms45.geekbang.designpattern.u014.auth;

import Algorithms45.geekbang.designpattern.u014.storage.CredentialStorage;
import Algorithms45.geekbang.designpattern.u014.token.AuthToken;
import Algorithms45.geekbang.designpattern.u014.apirequest.ApiRequest;
import Algorithms45.geekbang.designpattern.u014.storage.MySqlCredentialStorage;

/**
 * Created by HuGuodong on 12/4/19.
 */
public class DefaultApiAuthencatorImpl implements ApiAuthencator {

  private CredentialStorage storage;

  public DefaultApiAuthencatorImpl() {
    storage = new MySqlCredentialStorage();
  }


  @Override
  public void auth(String url) {
    ApiRequest req = ApiRequest.genFakeReq(url);
//    ApiRequest req = new ApiRequest(url);
    AuthToken clientToken = new AuthToken(req.getBaseUrl(), req.getTimeStamp(), req.getToken());
    if (clientToken.isExpired()) {
      throw new RuntimeException("Request has expired!");
    }
    final String password = storage.getPasswordByAppID(req.getAppID());
    //AuthToken serverToken = AuthToken.buildAuthToken(req, password);

    //if (!clientToken.match(serverToken)) {
    //  throw new RuntimeException("Client token does not match!");
    //}
    //System.out.println("pass auth!");
  }
}
