package com.tw.videoinagingplatform.Forum.model;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;


public interface ForumInterface<T> {

	public Page<Forum> findAll(Pageable pageable);

	public <S extends Forum> S save(S entity);

	public Optional<Forum> findById(Integer id);
	public boolean existsById(Integer id);

	public long count();

	public void deleteById(Integer id);

	public void delete(Forum entity);

	public void deleteAllById(Iterable<? extends Integer> ids);

	public void deleteAll(Iterable<? extends Forum> entities);

	public void deleteAll();

	public <S extends Forum> Optional<S> findOne(Example<S> example);

	public <S extends Forum> Page<S> findAll(Example<S> example, Pageable pageable);

	public <S extends Forum> long count(Example<S> example);

	public <S extends Forum> boolean exists(Example<S> example);

	public <S extends Forum, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	public List<Forum> findAll();

	public List<Forum> findAll(Sort sort);

	public List<Forum> findAllById(Iterable<Integer> ids);

	public <S extends Forum> List<S> saveAll(Iterable<S> entities);

	public void flush();

	public <S extends Forum> S saveAndFlush(S entity);

	public <S extends Forum> List<S> saveAllAndFlush(Iterable<S> entities);

	public void deleteAllInBatch(Iterable<Forum> entities);

	public void deleteAllByIdInBatch(Iterable<Integer> ids);

	public void deleteAllInBatch();

	public Forum getOne(Integer id);

	public Forum getById(Integer id);

	public Forum getReferenceById(Integer id);

	public <S extends Forum> List<S> findAll(Example<S> example);

	public <S extends Forum> List<S> findAll(Example<S> example, Sort sort);
}
