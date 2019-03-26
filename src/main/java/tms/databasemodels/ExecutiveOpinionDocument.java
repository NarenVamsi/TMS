package tms.databasemodels;

import com.sun.istack.internal.Nullable;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class ExecutiveOpinionDocument {
    private String executiveId;
    private Boolean opinion;
    private String reason;
}
