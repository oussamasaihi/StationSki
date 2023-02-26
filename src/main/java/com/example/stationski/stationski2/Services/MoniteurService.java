package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Moniteur;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MoniteurService implements IMoniteurService {

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return null;
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return null;
    }

    @Override
    public void delete(Long numMoniteur) {

    }

    @Override
    public List<Moniteur> findAll() {
        return null;
    }

    @Override
    public List<Moniteur> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Moniteur> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Moniteur> findAllById(Iterable<Long> longs) {
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
    public void delete(Moniteur entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Moniteur> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Moniteur> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Moniteur> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Moniteur> findById(Long aLong) {
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
    public <S extends Moniteur> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Moniteur> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Moniteur> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Moniteur getOne(Long aLong) {
        return null;
    }

    @Override
    public Moniteur getById(Long aLong) {
        return null;
    }

    @Override
    public Moniteur getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Moniteur> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Moniteur> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Moniteur> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Moniteur> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Moniteur> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Moniteur> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Moniteur, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
