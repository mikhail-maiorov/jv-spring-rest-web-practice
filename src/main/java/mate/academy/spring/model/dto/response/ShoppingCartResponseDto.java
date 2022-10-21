package mate.academy.spring.model.dto.response;

import java.util.List;

public class ShoppingCartResponseDto {
    private List<Long> ticketIds;
    private Long userId;

    public List<Long> getTicketIds() {
        return ticketIds;
    }

    public Long getUserId() {
        return userId;
    }

    public void setTicketIds(List<Long> ticketIds) {
        this.ticketIds = ticketIds;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
