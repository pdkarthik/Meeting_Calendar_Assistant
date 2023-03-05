public class MeetingDAO {
    private static List<Meeting> meetings = new ArrayList<>();
    private static int idCounter = 1;

    public Meeting createMeeting(int ownerId, String title, String description, LocalDateTime startTime, LocalDateTime endTime, List<Integer> attendees) {
        Meeting meeting = new Meeting(idCounter++, ownerId, title, description, startTime, endTime, attendees);
        meetings.add(meeting);
        return meeting;
    }

    public List<Meeting> getMeetingsByOwnerId(int ownerId) {
        List<Meeting> ownerMeetings = new ArrayList<>();
        for (Meeting meeting : meetings) {
            if (meeting.getOwnerId() == ownerId) {
                ownerMeetings.add(meeting);
            }
        }
        return ownerMeetings;
    }

    public List<Meeting> getAllMeetings() {
        return meetings;
    }
}
