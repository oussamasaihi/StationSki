package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Piste;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class PisteService implements IpisteService {
    @Override
    public List<Piste> retrieveAllPistes() {
        return null;
    }

    @Override
    public Piste addPiste(Piste piste) {
        return null;
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return null;
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return null;
    }

    @Override
    public void deletePiste(Long numPiste) {

    }

    @Override
    public List<Piste> findAll() {
        return null;
    }

    @Override
    public List<Piste> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Piste> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Piste> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Piste entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Piste> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Piste> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Piste> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Piste> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Piste> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Piste> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Piste> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Piste getOne(Long aLong) {
        return null;
    }

    @Override
    public Piste getById(Long aLong) {
        return null;
    }

    @Override
    public Piste getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Piste> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Piste> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Piste> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Piste> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Piste> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Piste> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Piste, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
