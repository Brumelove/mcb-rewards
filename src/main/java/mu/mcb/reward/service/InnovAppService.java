package mu.mcb.reward.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mu.mcb.reward.api.client.InnovAppClient;
import mu.mcb.reward.dto.Account;
import mu.mcb.reward.dto.AccountRequest;
import mu.mcb.reward.dto.CustomerRequest;
import mu.mcb.reward.utilities.JsonUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Brume
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class InnovAppService {
    private  final InnovAppClient innovAppClient;

    public void createAccount() {
        for (AccountRequest account: JsonUtils.createAccount() ) {
           innovAppClient.createAccounts(account);
        }
    }

    public CustomerRequest getCustomersById(String customerId) {
        return innovAppClient.getCustomersById(customerId).getBody();

    }

    public List<Account> getCustomerAccounts(String customerId) {
        return innovAppClient.getCustomerAccounts(customerId)
                .getBody();

    }

    public List<Account> getAccounts() {
        return innovAppClient.getAccounts().getBody();

    }
}
