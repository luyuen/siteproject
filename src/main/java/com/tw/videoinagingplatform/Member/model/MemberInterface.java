package com.tw.videoinagingplatform.Member.model;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

public interface MemberInterface<T> {

	public Page<Member> findAll(Pageable pageable);

	public <S extends Member> S save(S entity);

	public Optional<Member> findById(Integer id);

	public boolean existsById(Integer id);

	public long count();

	public void deleteById(Integer id);

	public void delete(Member entity);

	public void deleteAllById(Iterable<? extends Integer> ids);

	public void deleteAll(Iterable<? extends Member> entities);

	public void deleteAll();

	public <S extends Member> Optional<S> findOne(Example<S> example);

	public <S extends Member> Page<S> findAll(Example<S> example, Pageable pageable);

	public <S extends Member> long count(Example<S> example);

	public <S extends Member> boolean exists(Example<S> example);

	public <S extends Member, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	public List<Member> findAll();

	public List<Member> findAll(Sort sort);

	public List<Member> findAllById(Iterable<Integer> ids);

	public <S extends Member> List<S> saveAll(Iterable<S> entities);

	public void flush();

	public <S extends Member> S saveAndFlush(S entity);

	public <S extends Member> List<S> saveAllAndFlush(Iterable<S> entities);

	public void deleteAllInBatch(Iterable<Member> entities);

	public void deleteAllByIdInBatch(Iterable<Integer> ids);

	public void deleteAllInBatch();

	public Member getOne(Integer id);

	public Member getById(Integer id);

	public Member getReferenceById(Integer id);

	public <S extends Member> List<S> findAll(Example<S> example);

	public <S extends Member> List<S> findAll(Example<S> example, Sort sort);
}
