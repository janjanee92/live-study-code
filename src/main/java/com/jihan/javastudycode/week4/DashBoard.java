package com.jihan.javastudycode.week4;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.*;

public class DashBoard {

    // token 값은 각자 github 에서 생성. 이 값은 임의의 값으로 변경한 상태
    final String TOKEN = "my_secret_token";

    public static void main(String[] args) throws IOException {
        DashBoard dashBoard = new DashBoard();
        dashBoard.print();
    }

    private void print() throws IOException {
        // GitHub 연결
        GitHub gitHub = new GitHubBuilder().withOAuthToken(TOKEN).build();

        // "whiteship/live-study" Repo 정보 가져오기
        GHRepository repository = gitHub.getRepository("whiteship/live-study");

        // 전체 참여자를 담을 List
        List<Participant> participants = new ArrayList<>();

        // Repo에서 이슈 목록 전체(GHIssueState.ALL)을 가져온다.
        List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);

        int week = issues.size();

        // 이슈 목록 for-loop
        for(GHIssue issue : issues) {

            // 한 개의 이슈에서 코멘트 목록을 가져온다.
            List<GHIssueComment> comments = issue.getComments();

            // 코멘트 목록 for-loop
            for (GHIssueComment comment : comments) {
                // 한 개의 코멘트에서 참여자 ID를 가져온다.
                String userId = comment.getUser().getLogin();

                // 참여자 체크
                checkParticipant(participants, userId);

            }

        }

        // 참여자 목록을 순회하며 계산된 참여율을 출력한다.
        participants.forEach(p -> {
            System.out.printf("%s------------%.2f%% %n", p.getId(), p.getRate(week) );
        });

    }

    private void checkParticipant(List<Participant> participants, String userId) {

        Participant participant = findParticipant(participants, userId);

        participant.setCount(participant.getCount() + 1);

        participants.add(participant);

    }

    private Participant findParticipant(List<Participant> participants, String userId) {
        for (Participant participant: participants) {
            if (userId.equals(participant.getId())) {
                return participant;
            }
        }
        return new Participant(userId);
    }


}
