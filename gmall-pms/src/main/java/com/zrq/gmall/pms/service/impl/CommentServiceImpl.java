package com.zrq.gmall.pms.service.impl;

import com.zrq.gmall.api.pms.entity.Comment;
import com.zrq.gmall.pms.mapper.CommentMapper;
import com.zrq.gmall.api.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
