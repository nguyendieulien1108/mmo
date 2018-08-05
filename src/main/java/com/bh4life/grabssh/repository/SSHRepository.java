package com.bh4life.grabssh.repository;

import com.bh4life.grabssh.model.SSH;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SSHRepository extends PagingAndSortingRepository<SSH,Long> {
}
