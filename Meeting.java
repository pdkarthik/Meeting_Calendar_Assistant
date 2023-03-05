public class Meeting {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<Integer> attendees;

    public Meeting(int id, int ownerId, String title, String description, LocalDateTime startTime, LocalDateTime endTime, List<Integer> attendees) {
        this.id = id;
        this.ownerId = ownerId;
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.attendees = attendees;
    }

    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public List<Integer> getAttendees() {
        return attendees;
    }
}
