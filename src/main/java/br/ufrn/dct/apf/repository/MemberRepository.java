package br.ufrn.dct.apf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufrn.dct.apf.model.Member;

@Repository("memberRepository")
public interface MemberRepository extends JpaRepository<Member, Long> {

}
