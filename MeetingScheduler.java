public class MeetingScheduler {
    private MeetingDAO meetingDAO;

    public MeetingScheduler(MeetingDAO meetingDAO) {
        this.meetingDAO = meetingDAO;
    }

    public List<LocalDateTime> findFreeSlots(int ownerId1, int ownerId2, LocalDateTime startDate, LocalDateTime endDate, int durationInMinutes) {
        List<Meeting> owner1Meetings = meetingDAO.getMeetingsByOwnerId(ownerId1);
        List<Meeting> owner2Meetings = meetingDAO.getMeetingsByOwnerId(ownerId2);
        List<LocalDateTime> freeSlots = new ArrayList<>();
        LocalDateTime currentSlot = startDate;

        while (currentSlot.isBefore(endDate)) {
            LocalDateTime endSlot = currentSlot.plusMinutes(durationInMinutes);
            boolean isFree = true;
            for (Meeting meeting : owner1Meetings) {
                if (isOverlapping(meeting.getStartTime(), meeting.getEndTime(), currentSlot, endSlot)) {
                    isFree = false;
                    break;
                }
            }
            if (isFree) {
                for (Meeting meeting : owner2Meetings) {
                    if (isOverlapping(meeting.getStartTime(), meeting.getEndTime(), currentSlot, endSlot)) {
                        isFree = false;
                        break;
                    }
                }
            }
            if (isFree) {
                freeSlots.add
