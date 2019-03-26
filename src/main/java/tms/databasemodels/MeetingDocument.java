package tms.databasemodels;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Setter
@Getter
public class MeetingDocument {
    private int meetingId;
    private String meetingInitiator;
    private String meetingName;
    private Timestamp startTime;
    private Timestamp endTime;
    private String description;
    private List<String> executiveIdList;
    private List<String> clientList;
    private List<LogDocument> logDocuments;
}
