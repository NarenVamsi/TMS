package tms.databasemodels;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ScheduleDocument {
    private String employeeId;
    private List<DailyScheduleDocument> dailyScheduleDocuments;
}
