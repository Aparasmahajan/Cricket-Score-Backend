package com.cricket.aps.service;

import com.cricket.aps.entity.Match;

import java.util.List;

public interface MatchService {
    List<Match> getAllMatches();
    List<Match> getLiveMatches();
    List<List<String>> getPointTable();
}
