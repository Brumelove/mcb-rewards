package mu.mcb.reward.controller;

import lombok.RequiredArgsConstructor;
import mu.mcb.reward.dto.Transaction;
import mu.mcb.reward.dto.TransactionRequest;
import mu.mcb.reward.enums.SubCategoryType;
import mu.mcb.reward.service.TierService;
import mu.mcb.reward.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transaction")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TransactionController {
    private final TransactionService transactionService;

    @PostMapping()
    public ResponseEntity<Transaction> create(@RequestBody TransactionRequest transactionRequest) {
        return ResponseEntity.ok(transactionService.postTransaction(transactionRequest));
    }

    @GetMapping("/categories")
    public ResponseEntity<List<SubCategoryType>> getCategoryList() {
        return ResponseEntity.ok(SubCategoryType.getSubCategory());
    }
}
