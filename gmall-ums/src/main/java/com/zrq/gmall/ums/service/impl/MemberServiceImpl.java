package com.zrq.gmall.ums.service.impl;

import com.zrq.gmall.api.ums.entity.Member;
import com.zrq.gmall.ums.mapper.MemberMapper;
import com.zrq.gmall.api.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
