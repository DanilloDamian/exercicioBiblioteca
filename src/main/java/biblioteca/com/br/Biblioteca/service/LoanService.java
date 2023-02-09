package biblioteca.com.br.Biblioteca.service;
import biblioteca.com.br.Biblioteca.entity.Loan;
import biblioteca.com.br.Biblioteca.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public Loan save(Loan loan){
        return this.loanRepository.save(loan);
    }
    public Loan findById(Long id){
        Optional<Loan> loanFound = this.loanRepository.findById(id);
        if(loanFound.isPresent()){
            return loanFound.get();
        }
        return null;
    }

    public Loan update(Long id, Loan loan){
        Loan loanFound = findById(id);
        if(loanFound != null){
            loanFound.setInitialDate(loan.getInitialDate());
            loanFound.setFinalDate(loan.getFinalDate());
            loanFound.setBook(loan.getBook());
            loanFound.setUsuario(loan.getUsuario());
            return this.loanRepository.save(loanFound);
        }
        return null;
    }

    public List<Loan> list(){
        return this.loanRepository.findAll();
    }

    public void delete(Long id){
        Loan loanFound = findById(id);
        if(loanFound != null){
            this.loanRepository.deleteById(id);
        }
    }
}
