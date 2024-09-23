import java.time.LocalDate;

class Loan {
    private Book book;
    private Member member;
    private LocalDate loanDate;

    public Loan(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.loanDate = LocalDate.now();
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    @Override
    public String toString() {
        return "Loan: " + book + ", Member: " + member + ", Loan Date: " + loanDate;
    }
}
