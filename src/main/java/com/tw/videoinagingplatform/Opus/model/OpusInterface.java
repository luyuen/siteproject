package com.tw.videoinagingplatform.Opus.model;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;



public interface OpusInterface<T> {
	public Page<Opus> findAll(Pageable pageable);

	public <S extends Opus> S save(S entity);

	public Optional<Opus> findById(Integer id);
	public boolean existsById(Integer id);

	public long count();

	public void deleteById(Integer id);

	public void delete(Opus entity);

	public void deleteAllById(Iterable<? extends Integer> ids);

	public void deleteAll(Iterable<? extends Opus> entities);

	public void deleteAll();

	public <S extends Opus> Optional<S> findOne(Example<S> example);

	public <S extends Opus> Page<S> findAll(Example<S> example, Pageable pageable);

	public <S extends Opus> long count(Example<S> example);

	public <S extends Opus> boolean exists(Example<S> example);

	public <S extends Opus, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	public List<Opus> findAll();

	public List<Opus> findAll(Sort sort);

	public List<Opus> findAllById(Iterable<Integer> ids);

	public <S extends Opus> List<S> saveAll(Iterable<S> entities);

	public void flush();

	public <S extends Opus> S saveAndFlush(S entity);

	public <S extends Opus> List<S> saveAllAndFlush(Iterable<S> entities);

	public void deleteAllInBatch(Iterable<Opus> entities);

	public void deleteAllByIdInBatch(Iterable<Integer> ids);

	public void deleteAllInBatch();

	public Opus getOne(Integer id);

	public Opus getById(Integer id);

	public Opus getReferenceById(Integer id);

	public <S extends Opus> List<S> findAll(Example<S> example);

	public <S extends Opus> List<S> findAll(Example<S> example, Sort sort);

}
