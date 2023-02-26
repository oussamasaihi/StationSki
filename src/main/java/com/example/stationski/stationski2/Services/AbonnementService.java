package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.Repos.AbonnementRepo;
import com.example.stationski.stationski2.entities.Abonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class AbonnementService implements IAbonnementService {
    @Autowired
    private AbonnementRepo abonnementRepo ;

    @Override
    public List<Abonnement> findAll() {
        return null;
    }

    @Override
    public List<Abonnement> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Abonnement> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Abonnement> findAllById(Iterable<Long> longs) {
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
    public void delete(Abonnement entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Abonnement> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Abonnement> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Abonnement> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Abonnement> findById(Long aLong) {
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
    public <S extends Abonnement> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Abonnement> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Abonnement> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Abonnement getOne(Long aLong) {
        return null;
    }

    @Override
    public Abonnement getById(Long aLong) {
        return null;
    }

    @Override
    public Abonnement getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Abonnement> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Abonnement> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Abonnement> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Abonnement> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Abonnement> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Abonnement> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Abonnement, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
