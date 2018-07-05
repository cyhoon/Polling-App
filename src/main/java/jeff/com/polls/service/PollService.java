package jeff.com.polls.service;

import jeff.com.polls.payload.PagedResponse;
import jeff.com.polls.payload.PollResponse;
import jeff.com.polls.repository.PollRepository;
import jeff.com.polls.repository.UserRepository;
import jeff.com.polls.repository.VoteRepository;
import jeff.com.polls.security.UserPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollService {

    @Autowired
    private PollRepository pollRepository;

    @Autowired
    private VoteRepository voteRepository;

    @Autowired
    private UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(PollService.class);

    public PagedResponse<PollResponse> getAllPolls(UserPrincipal currentUser, int page, int size) {
        validatePageNumberAndSize(page, size);

        
    }
}
