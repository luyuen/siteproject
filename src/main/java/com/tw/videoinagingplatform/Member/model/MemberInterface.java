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

	public Page<Message> findAll(Pageable pageable);

	public <S extends Message> S save(S entity);

	public Optional<Message> findById(Integer id);
	public boolean existsById(Integer id);

	public long count();

	public void deleteById(Integer id);

	public void delete(Message entity);

	public void deleteAllById(Iterable<? extends Integer> ids);

	public void deleteAll(Iterable<? extends Message> entities);

	public void deleteAll();

	public <S extends Message> Optional<S> findOne(Example<S> example);

	public <S extends Message> Page<S> findAll(Example<S> example, Pageable pageable);

	public <S extends Message> long count(Example<S> example);

	public <S extends Message> boolean exists(Example<S> example);

	public <S extends Message, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	public List<Message> findAll();

	public List<Message> findAll(Sort sort);

	public List<Message> findAllById(Iterable<Integer> ids);

	public <S extends Message> List<S> saveAll(Iterable<S> entities);

	public void flush();

	public <S extends Message> S saveAndFlush(S entity);

	public <S extends Message> List<S> saveAllAndFlush(Iterable<S> entities);

	public void deleteAllInBatch(Iterable<Message> entities);

	public void deleteAllByIdInBatch(Iterable<Integer> ids);

	public void deleteAllInBatch();

	public Message getOne(Integer id);

	public Message getById(Integer id);

	public Message getReferenceById(Integer id);

	public <S extends Message> List<S> findAll(Example<S> example);

	public <S extends Message> List<S> findAll(Example<S> example, Sort sort);

}
