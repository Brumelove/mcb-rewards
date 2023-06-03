package mu.mcb.reward.controller;

import lombok.RequiredArgsConstructor;
import mu.mcb.reward.dto.Customer;
import mu.mcb.reward.dto.CustomerResponse;
import mu.mcb.reward.service.AccountService;
import mu.mcb.reward.service.RewardsService;
import mu.mcb.reward.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Brume
 */
@RestController
@RequestMapping("/api/v1/accounts")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AccountController {
    private final AccountService service;
    private final RewardsService rewardsService;

    @PostMapping("/{customerId}")
    public ResponseEntity<String> create(@PathVariable String customerId) {
        return ResponseEntity.ok(service.createAccount(customerId));
    }

    @PostMapping("/{customerId}/redeem/{points}")
    public ResponseEntity<Integer> redeem(@PathVariable String customerId, @PathVariable Integer points) {
        return ResponseEntity.ok(service.redeemPoints(customerId, points));
    }

    @PutMapping("/{customerId}/tier/{tier}")
    public ResponseEntity<Void> updateTier(@PathVariable String customerId, @PathVariable String tier) {
        rewardsService.updateRewards(customerId, tier);
        return ResponseEntity.ok().build();
    }
}
