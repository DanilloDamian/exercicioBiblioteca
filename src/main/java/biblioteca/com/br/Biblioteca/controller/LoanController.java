package biblioteca.com.br.Biblioteca.controller;
import biblioteca.com.br.Biblioteca.entity.Loan;
import biblioteca.com.br.Biblioteca.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public Loan save(@RequestBody Loan loan){
        return this.loanService.save(loan);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Loan> update(@PathVariable Long id, @RequestBody Loan loan){
        return ResponseEntity.ok(this.loanService.update(id,loan));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Loan> findById(@PathVariable Long id){
        return ResponseEntity.ok(this.loanService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Loan>> list(){
        return ResponseEntity.ok(this.loanService.list());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        this.loanService.delete(id);
        return ResponseEntity.ok().build();
    }
}
