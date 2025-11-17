package HomeTasteGrp.HomeTaste.ModelsDTO;

import HomeTasteGrp.HomeTaste.Models.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerInfoDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private boolean approved;
    private boolean isDeleted;

    private String businessName;
    private LocalDate dateOfBirth;
    private String profileImgUrl;
    private String description;
    private String documentUrl;
    private List<String> socialLinks;
    private String category;
    private String address;
}
